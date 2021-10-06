@Test
    public void testSerialization() {
        ValueMarker m1 = new ValueMarker(25.0);
        ValueMarker m2 = (ValueMarker) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    