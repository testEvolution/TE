@Test
    public void testSerialization() {
        StandardDialRange r1 = new StandardDialRange();
        StandardDialRange r2 = (StandardDialRange) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

}