@Test
    public void testCloning() throws CloneNotSupportedException {
        StrokeMap m1 = new StrokeMap();
        StrokeMap m2 = (StrokeMap) m1.clone();
        assertTrue(m1.equals(m2));

        m1.put("K1", new BasicStroke(1.1f));
        m1.put("K2", new BasicStroke(2.2f));
        m2 = (StrokeMap) m1.clone();
        assertTrue(m1.equals(m2));
    }

    