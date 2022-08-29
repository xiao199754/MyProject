package org.example;

public class TestDemo {

    public static void main(String[] args) {
        int[] arr = {10,5,32,6,7,9,17,22,3};
        //外层控制对比轮数
        for(int i = 0; i < arr.length; i++) {
            //内层循环控制每轮对比次数,每一轮依次减少一次对比次数,减1是因为数组最末尾数字无需对比且不减少1会出现数组下标越界
            System.out.println("第"+i+"轮：");
            for(int j = 0; j < arr.length - i -1; j ++){
                //升序排序（从小到大）：如果J下标数字大于后面数字则交换位置，将大的数字往后排，否则保持不动
                //降序排序（从大到小）：如果J下标数字小于后面数字则交换位置，将小的数字往后排，否则保持不动
                if (arr[j] > arr[j+1]) {
                    //定义临时变量，交换数字位置。
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    System.out.println();
                    for (int k:arr) {
                        System.out.print(k+" ");
                    }
                }
            }
        }
        //打印排序结果
        System.out.println();
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
