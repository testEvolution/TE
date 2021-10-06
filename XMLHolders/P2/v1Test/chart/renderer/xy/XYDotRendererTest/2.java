@Test
    public void testCloning() throws CloneNotSupportedException {
        XYDotRenderer r1 = new XYDotRenderer();
        XYDotRenderer r2 = (XYDotRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    