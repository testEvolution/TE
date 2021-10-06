@Test
    public void testCloning() {
        EmptyBlock b1 = new EmptyBlock(1.0, 2.0);
        Rectangle2D bounds1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0);
        b1.setBounds(bounds1);
        EmptyBlock b2 = null;

        try {
            b2 = (EmptyBlock) b1.clone();
        }
        catch (CloneNotSupportedException e) {
            fail(e.toString());
        }
        assertTrue(b1 != b2);
        assertTrue(b1.getClass() == b2.getClass());
        assertTrue(b1.equals(b2));

        bounds1.setFrame(2.0, 4.0, 6.0, 8.0);
        assertFalse(b1.equals(b2));
        b2.setBounds(new Rectangle2D.Double(2.0, 4.0, 6.0, 8.0));
        assertTrue(b1.equals(b2));
    }

    