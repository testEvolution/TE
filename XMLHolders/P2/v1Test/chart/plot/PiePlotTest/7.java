@Test
    public void testSerialization() {
        PiePlot p1 = new PiePlot(null);
        PiePlot p2 = (PiePlot) TestUtils.serialised(p1);
        assertEquals(p1, p2);
    }

    