@Test
    public void testSerialization() {
        NumberAxis a1 = new NumberAxis("Test Axis");
        NumberAxis a2 = (NumberAxis) TestUtils.serialised(a1);
        assertEquals(a1, a2);
    }

    