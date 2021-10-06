@Test
    public void testSerialization() {
        BorderArrangement b1 = new BorderArrangement();
        BorderArrangement b2 = (BorderArrangement) TestUtils.serialised(b1);
        assertEquals(b1, b2);
    }

    