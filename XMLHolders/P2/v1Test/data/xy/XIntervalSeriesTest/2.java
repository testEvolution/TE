@Test
    public void testCloning() throws CloneNotSupportedException {
        XIntervalSeries s1 = new XIntervalSeries("s1");
        s1.add(1.0, 0.5, 1.5, 2.0);
        XIntervalSeries s2 = (XIntervalSeries) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));
    }

    