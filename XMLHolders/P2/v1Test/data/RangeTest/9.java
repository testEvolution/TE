@Test
    public void testSerialization() {
        Range r1 = new Range(25.0, 133.42);
        Range r2 = (Range) TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    