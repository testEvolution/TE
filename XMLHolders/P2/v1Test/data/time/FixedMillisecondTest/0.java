@Test
    public void testSerialization() {
        FixedMillisecond m1 = new FixedMillisecond();
        FixedMillisecond m2 = (FixedMillisecond) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    