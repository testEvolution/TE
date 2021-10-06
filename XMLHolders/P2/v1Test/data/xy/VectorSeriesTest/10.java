@Test
    public void testSetMaximumItemCount2() {
        VectorSeries s1 = new VectorSeries("S1");
        s1.add(1.0, 1.1, 1.1, 1.1);
        s1.add(2.0, 2.2, 2.2, 2.2);
        s1.add(3.0, 3.3, 3.3, 3.3);
        s1.setMaximumItemCount(2);
        assertEquals(2.0, s1.getXValue(0), EPSILON);
        assertEquals(3.0, s1.getXValue(1), EPSILON);
    }

    