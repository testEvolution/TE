@Test
    public void testSerialization() {
        StandardDialFrame f1 = new StandardDialFrame();
        StandardDialFrame f2 = (StandardDialFrame) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

}