package org.example.sort.data;

/*
    "Length" - длина массива, который будет сортироваться алгоритмом
    "Counts" - количество повторений эксперимента для данной длины массива
*/
public class Experiment {
    public Integer length;
    public Integer counts;

    public Experiment(Integer length, Integer counts){
        this.length = length;
        this.counts = counts;
    }


}
