package org.example;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.factory.Nd4j;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        INDArray arr = Nd4j.create(new double[]{1.0});
        System.out.println(arr.add(2));
    }
}
