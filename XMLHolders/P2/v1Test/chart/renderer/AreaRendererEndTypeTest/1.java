@Test
    public void testSerialization() {
        AreaRendererEndType t1 = AreaRendererEndType.TAPER;
        AreaRendererEndType t2 = (AreaRendererEndType) TestUtils.serialised(t1);
        assertEquals(t1, t2);
        boolean same = t1 == t2;
        assertEquals(true, same);
    }

}