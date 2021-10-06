@Test
    public void testSerialization() {
        ShortTextTitle t1 = new ShortTextTitle("ABC");
        ShortTextTitle t2 = (ShortTextTitle) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}