@Test
    public void testSerialization() {
        Day d1 = new Day(15, 4, 2000);
        Day d2 = (Day) TestUtils.serialised(d1);
        assertEquals(d1, d2);
    }

    