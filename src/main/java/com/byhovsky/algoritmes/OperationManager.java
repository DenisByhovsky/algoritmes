package com.byhovsky.algoritmes;

/**
 * Operation manager
 *
 * @author Denis Byhovsky
 */
public class OperationManager {

    public static final int SIZE = 5;

    public OperationManager() {
    }

    public void selectAlgoritm(String typeAll) {
        OperationType type = OperationType.valueOf(typeAll.toUpperCase());
        switch (type) {
            case QSORT:
                new QuickSort().printQuickSort();
                break;
            case MERSORT:
                new MergeSort().printMergeSort();
                break;
            case INSSORT:
                new InsertSort().printInsSort();
                break;
            case BINSEARCH:
                new BinarySearch().printAllBin();
                break;
            case RECURS:
                System.out.println(new RecursionType().calculateFactorial(SIZE));
                break;
            case GRAPH:
                Graph graph = new Graph(SIZE);
                graph.printGraph(graph);
                break;
            default:
                new QuickSort().printQuickSort();
                break;
        }
    }

}
