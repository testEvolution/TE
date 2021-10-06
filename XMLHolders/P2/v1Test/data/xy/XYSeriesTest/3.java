@Test
    public void testCloning2() throws CloneNotSupportedException {
        XYSeries s1 = new XYSeries("S1");
        s1.add(1.0, 100.0);
        s1.add(2.0, null);
        s1.add(3.0, 200.0);
        XYSeries s2 = (XYSeries) s1.clone();
        assertTrue(s1.equals(s2));

        // check independence
        s2.add(4.0, 300.0);
        assertFalse(s1.equals(s2));
        s1.add(4.0, 300.0);
        assertTrue(s1.equals(s2));
    }

    