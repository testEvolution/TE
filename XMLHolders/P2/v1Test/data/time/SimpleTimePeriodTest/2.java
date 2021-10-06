@Test
    public void testSerialization() {
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(1000L),
                new Date(1001L));
        SimpleTimePeriod p2 = (SimpleTimePeriod) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    