@Test
    public void testSerialization() {
        Week w1 = new Week(24, 1999);
        Week w2 = (Week) TestUtils.serialised(w1);
        assertEquals(w1, w2);
    }

    