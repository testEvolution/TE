@Test
    public void testSerialization() {
        DeviationStepRenderer r1 = new DeviationStepRenderer();
        DeviationStepRenderer r2 = (DeviationStepRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}