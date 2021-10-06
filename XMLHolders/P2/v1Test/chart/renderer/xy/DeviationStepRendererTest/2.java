@Test
    public void testCloning() throws CloneNotSupportedException {
        DeviationStepRenderer r1 = new DeviationStepRenderer();
        DeviationStepRenderer r2 = (DeviationStepRenderer) r1.clone();
        assertTrue(r1 != r2);
        assertTrue(r1.getClass() == r2.getClass());
        assertTrue(r1.equals(r2));
    }

    