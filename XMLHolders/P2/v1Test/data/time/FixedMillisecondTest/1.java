@Test
    public void testHashcode() {
        FixedMillisecond m1 = new FixedMillisecond(500000L);
        FixedMillisecond m2 = new FixedMillisecond(500000L);
        assertTrue(m1.equals(m2));
        int h1 = m1.hashCode();
        int h2 = m2.hashCode();
        assertEquals(h1, h2);
    }

    