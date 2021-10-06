@Test
    public void testSerialization() {
        DeviationRenderer r1 = new DeviationRenderer();
        DeviationRenderer r2 = (DeviationRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}