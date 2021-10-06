@Test
    public void testQ1Y1900Next() {
        Quarter next = (Quarter) this.q1Y1900.next();
        assertEquals(this.q2Y1900, next);
    }

    