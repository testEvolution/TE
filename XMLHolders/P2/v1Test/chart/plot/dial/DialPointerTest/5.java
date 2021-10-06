@Test
    public void testSerialization() {
        // test a default instance
        DialPointer i1 = new DialPointer.Pin(1);
        DialPointer i2 = (DialPointer) TestUtils.serialised(i1);
        assertEquals(i1, i2);
    }

    