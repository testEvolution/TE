@Test
    public void testSerialization() {
        DateAxis a1 = new DateAxis("Test Axis");
        DateAxis a2 = (DateAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    