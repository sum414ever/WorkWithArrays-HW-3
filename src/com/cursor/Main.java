package com.cursor;

import com.cursor.actionsWithArrays.*;

public class Main {

    public static void main(String[] args) {
        ReverseSort arraySort = new ReverseSort();
        arraySort.sortArrayByReverse();

        ListValueReplace returnValue = new ListValueReplace();
        returnValue.changeValueInArray();

        SumAllPositiveValues returnSum = new SumAllPositiveValues();
        returnSum.addedAllPositiveValues();

        AverageAllNumbers returnAverage = new AverageAllNumbers();
        returnAverage.returnAverageAllNumbers();

        NumbersThatIsDivisibleByThree arrayNonDivisibleByThreeNumbers = new NumbersThatIsDivisibleByThree();
        arrayNonDivisibleByThreeNumbers.removeAllNumbersThatIsDivisibleByThree();
    }
}
