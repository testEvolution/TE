@Test
    public void testSerialization() {
        Second s1 = new Second();
        Second s2 = (Second) TestUtils.serialised(s1);
        assertEquals(s1, s2);
    }

    