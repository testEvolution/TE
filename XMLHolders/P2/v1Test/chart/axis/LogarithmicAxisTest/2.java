@Test
    public void testSerialization() {
        LogarithmicAxis a1 = new LogarithmicAxis("Test Axis");
        LogarithmicAxis a2 = (LogarithmicAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    