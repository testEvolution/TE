@Test
    public void testRemove2() {
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 1.1);
        s1.add(2.0, 2.2);
        s1.add(3.0, 3.3);
        s1.add(4.0, 4.4);
        s1.add(5.0, 5.5);
        s1.add(6.0, 6.6);
        assertEquals(6, s1.getItemCount());
        assertEquals(1.0, s1.getMinX(), EPSILON);
        assertEquals(6.0, s1.getMaxX(), EPSILON);
        assertEquals(1.1, s1.getMinY(), EPSILON);
        assertEquals(6.6, s1.getMaxY(), EPSILON);

        s1.remove(5);
        assertEquals(5, s1.getItemCount());
        assertEquals(1.0, s1.getMinX(), EPSILON);
        assertEquals(5.0, s1.getMaxX(), EPSILON);
        assertEquals(1.1, s1.getMinY(), EPSILON);
        assertEquals(5.5, s1.getMaxY(), EPSILON);
    }

    