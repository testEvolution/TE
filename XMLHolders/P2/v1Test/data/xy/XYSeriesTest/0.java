@Test
    public void testEquals() {
        XYSeries s1 = new XYSeries("Series");
        s1.add(1.0, 1.1);
        XYSeries s2 = new XYSeries("Series");
        s2.add(1.0, 1.1);
        assertTrue(s1.equals(s2));
        assertTrue(s2.equals(s1));

        s1.setKey("Series X");
        assertFalse(s1.equals(s2));
        s2.setKey("Series X");
        assertTrue(s1.equals(s2));

        s1.add(2.0, 2.2);
        assertFalse(s1.equals(s2));
        s2.add(2.0, 2.2);
        assertTrue(s1.equals(s2));
    }

    