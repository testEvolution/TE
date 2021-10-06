@Test
    public void testSetLowerBound() {
        NumberAxis axis = new NumberAxis("X");
        axis.setRange(0.0, 10.0);
        axis.setLowerBound(5.0);
        assertEquals(5.0, axis.getLowerBound(), EPSILON);
        axis.setLowerBound(10.0);
        assertEquals(10.0, axis.getLowerBound(), EPSILON);
        assertEquals(11.0, axis.getUpperBound(), EPSILON);

        //axis.setRangeType(RangeType.POSITIVE);
        //axis.setLowerBound(-5.0);
        //assertEquals(0.0, axis.getLowerBound(), EPSILON);
    }

}