@Test
    public void testSerialization() {
        Millisecond m1 = new Millisecond();
        Millisecond m2 = (Millisecond) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

    