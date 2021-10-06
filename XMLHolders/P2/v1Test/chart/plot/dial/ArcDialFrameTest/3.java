@Test
    public void testSerialization() {
        ArcDialFrame f1 = new ArcDialFrame();
        ArcDialFrame f2 = (ArcDialFrame) TestUtils.serialised(f1);
        assertEquals(f1, f2);
    }

}