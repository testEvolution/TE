@Test
    public void testSerialization() {
        LogAxis a1 = new LogAxis("Test Axis");
        LogAxis a2 = (LogAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    