@Test
    public void testDec9999Next() {
        Month next = (Month) this.dec9999.next();
        assertNull(next);
    }

    