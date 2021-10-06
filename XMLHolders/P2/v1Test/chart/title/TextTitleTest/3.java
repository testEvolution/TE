@Test
    public void testSerialization() {
        TextTitle t1 = new TextTitle("Test");
        TextTitle t2 = (TextTitle) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}