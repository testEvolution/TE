@Test
    public void testSerialization() {
        Hour h1 = new Hour();
        Hour h2 = (Hour) TestUtils.serialised(h1);
        assertEquals(h1, h2);
    }

    