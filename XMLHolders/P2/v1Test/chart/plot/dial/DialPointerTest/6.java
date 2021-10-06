@Test
    public void testSerialization2() {
        DialPointer i1 = new DialPointer.Pointer(1);
        DialPointer i2 = (DialPointer) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }
}