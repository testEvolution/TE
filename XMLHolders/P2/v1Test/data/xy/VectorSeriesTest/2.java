@Test
    public void testCloning() throws CloneNotSupportedException {
        VectorSeries s1 = new VectorSeries("s1");
        s1.add(1.0, 0.5, 1.5, 2.0);
        VectorSeries s2 = (VectorSeries) s1.clone();
        assertTrue(s1 != s2);
        assertTrue(s1.getClass() == s2.getClass());
        assertTrue(s1.equals(s2));
    }

    