@Test
    public void testSerialization() {
        Year y1 = new Year(1999);
        Year y2 = (Year) TestUtils.serialised(y1);
        assertEquals(y1, y2);
    }

    