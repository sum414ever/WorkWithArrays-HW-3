package com.cursor;

import com.cursor.tasks.*;

public class Main {

    public static void main(String[] args) {
        ReverseSort arraySort = new ReverseSort();
        arraySort.sortArrayByReverse();

        ListValueReplace returnValue = new ListValueReplace();
        returnValue.changeValueInArray();

        SumAllPositiveValues returnSum = new SumAllPositiveValues();
        returnSum.addAllPositiveValues();

        AverageAllNumbers returnAverage = new AverageAllNumbers();
        returnAverage.returnAverageAllNumbers();

        NumbersThatIsDivisibleByThree arrayNonDivisibleByThreeNumbers = new NumbersThatIsDivisibleByThree();
        arrayNonDivisibleByThreeNumbers.removeAllNumbersThatIsDivisibleByThree();
    }
}
