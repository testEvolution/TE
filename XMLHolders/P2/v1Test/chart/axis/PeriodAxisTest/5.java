@Test
    public void testSerialization() {
        PeriodAxis a1 = new PeriodAxis("Test Axis");
        PeriodAxis a2 = (PeriodAxis) TestUtils.serialised(a1);
        boolean b = a1.equals(a2);
        assertTrue(b);
    }

    