@Test
    public void testSerialization() {
        DateTitle t1 = new DateTitle();
        DateTitle t2 = (DateTitle) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}