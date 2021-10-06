@Test
    public void testCloning() throws CloneNotSupportedException {
        XYStepRenderer r1 = new XYStepRenderer();
        XYStepRenderer r2 = (XYStepRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    