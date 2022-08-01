package com.java.blog.service.serviceImpl;

import com.java.blog.dao.TagRepository;
import com.java.blog.handler.NotFoundException;
import com.java.blog.po.Tag;
import com.java.blog.service.TagService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag tag) {
        return tagRepository.save(tag);
    }

    @Override
    public List<Tag> saveNoTag(Tag tag, String ids) {
        List list = convertToList2(ids);
        List<Tag> tagList = new ArrayList<>();

            for (int i=0;i<list.size();i++){
                if (StringUtils.isNumeric(list.get(i).toString())){
                    if (getTag(Long.parseLong(list.get(i).toString()))!=null){
                        continue;
                    }else if (!"".equals(list.get(i).toString()) && list.get(i).toString()!=null){
                        tag.setId(null);
                        tag.setName(list.get(i).toString());
                        tagList.add(tagRepository.save(tag));
                    }
                }else if (!"".equals(list.get(i).toString()) && list.get(i).toString()!=null){
                    tag.setId(null);
                    tag.setName(list.get(i).toString());
                    tagList.add(tagRepository.save(tag));
                }
            }
            return tagList;
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.findById(id).get();
    }

    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findByName(name);
    }

    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }

    @Override
    public List<Tag> listTagTop(Integer size) {
        Sort sort = Sort.by(Sort.Direction.DESC,"blogs.size");
        Pageable pageable = PageRequest.of(0,size,sort);
        return tagRepository.findTop(pageable);
    }

    @Override
    public List<Tag> listTag(String ids) {

        List list = convertToList2(ids);
        List<Tag> tagList = new ArrayList<>();

        for (int i=0;i<list.size();i++){
            if (StringUtils.isNumeric(list.get(i).toString())){
                tagList.add(tagRepository.findById(Long.parseLong(list.get(i).toString())).get());
            }else {
                tagList.add(tagRepository.findByName(list.get(i).toString()));
            }
        }
        return tagList;
    }

    /*
    * 转换以 "," 分割的字符串为list集合
    * */
    /*private List<Long> convertToList(String ids){
        List<Long> longList = new ArrayList<>();
        if (!"".equals(ids) && ids != null){
            String[] idarray = ids.split(",");
            for (int i=0;i<idarray.length;i++){
                longList.add(new Long(idarray[i]));
            }
        }
        return longList;
    }*/

    private List convertToList2(String ids){
        List longList = new ArrayList<>();
        if (!"".equals(ids) && ids != null){
            String[] idarray = ids.split(",");
            for (int i=0;i<idarray.length;i++){
                longList.add(idarray[i]);
            }
        }
        return longList;
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag tag) {
        Tag t = tagRepository.findById(id).get();
        if (t==null){
            throw new NotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(tag,t);
        return tagRepository.save(t);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
