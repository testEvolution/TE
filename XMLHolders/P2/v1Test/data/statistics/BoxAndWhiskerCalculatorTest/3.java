@Test
    public void test1593149() {
        ArrayList<Double> theList = new ArrayList<>(5);
        theList.add(0, 1.0);
        theList.add(1, 2.0);
        theList.add(2, Double.NaN);
        theList.add(3, 3.0);
        theList.add(4, 4.0);
        BoxAndWhiskerItem theItem =
            BoxAndWhiskerCalculator.calculateBoxAndWhiskerStatistics(theList);
        assertEquals(1.0, theItem.getMinRegularValue().doubleValue(), EPSILON);
        assertEquals(4.0, theItem.getMaxRegularValue().doubleValue(), EPSILON);
    }
}