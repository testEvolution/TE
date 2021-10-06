@Test
    public void testSerialization() {
        WindItemRenderer r1 = new WindItemRenderer();
        WindItemRenderer r2 = (WindItemRenderer) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}