@Test
    public void testCloning3() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("S1");
        XYSeries s2 = (XYSeries) s1.clone();
        assertTrue(s1.equals(s2));

        // check independence
        s2.add(4.0, 300.0);
        assertFalse(s1.equals(s2));
        s1.add(4.0, 300.0);
        assertTrue(s1.equals(s2));
    }

    