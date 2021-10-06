@Test
    public void testEquals() {
        DefaultDrawingSupplier r1 = new DefaultDrawingSupplier();
        DefaultDrawingSupplier r2 = new DefaultDrawingSupplier();
        assertTrue(r1.equals(r2));
        assertTrue(r2.equals(r1));

        // set up some objects...
        Paint[] ps1A = new Paint[] {Color.RED, Color.BLUE};
        Paint[] ps2A = new Paint[] {Color.GREEN, Color.YELLOW, Color.WHITE};
        Paint[] ops1A = new Paint[] {Color.LIGHT_GRAY, Color.BLUE};
        Paint[] ops2A = new Paint[] {Color.BLACK, Color.YELLOW, Color.CYAN};
        Stroke[] ss1A = new Stroke[] {new BasicStroke(1.1f)};
        Stroke[] ss2A
            = new Stroke[] {new BasicStroke(2.2f), new BasicStroke(3.3f)};
        Stroke[] oss1A = new Stroke[] {new BasicStroke(4.4f)};
        Stroke[] oss2A
            = new Stroke[] {new BasicStroke(5.5f), new BasicStroke(6.6f)};
        Shape[] shapes1A = new Shape[] {
            new Rectangle2D.Double(1.0, 1.0, 1.0, 1.0)
        };
        Shape[] shapes2A = new Shape[] {
            new Rectangle2D.Double(2.0, 2.0, 2.0, 2.0),
            new Rectangle2D.Double(2.0, 2.0, 2.0, 2.0)
        };
        Paint[] ps1B = new Paint[] {Color.RED, Color.BLUE};
        Paint[] ps2B = new Paint[] {Color.GREEN, Color.YELLOW, Color.WHITE};
        Paint[] ops1B = new Paint[] {Color.LIGHT_GRAY, Color.BLUE};
        Paint[] ops2B = new Paint[] {Color.BLACK, Color.YELLOW, Color.CYAN};
        Stroke[] ss1B = new Stroke[] {new BasicStroke(1.1f)};
        Stroke[] ss2B
            = new Stroke[] {new BasicStroke(2.2f), new BasicStroke(3.3f)};
        Stroke[] oss1B = new Stroke[] {new BasicStroke(4.4f)};
        Stroke[] oss2B
            = new Stroke[] {new BasicStroke(5.5f), new BasicStroke(6.6f)};
        Shape[] shapes1B = new Shape[] {
            new Rectangle2D.Double(1.0, 1.0, 1.0, 1.0)
        };
        Shape[] shapes2B = new Shape[] {
            new Rectangle2D.Double(2.0, 2.0, 2.0, 2.0),
            new Rectangle2D.Double(2.0, 2.0, 2.0, 2.0)
        };

        r1 = new DefaultDrawingSupplier(ps1A, ops1A, ss1A, oss1A, shapes1A);
        r2 = new DefaultDrawingSupplier(ps1B, ops1B, ss1B, oss1B, shapes1B);
        assertTrue(r1.equals(r2));

        // paint sequence
        r1 = new DefaultDrawingSupplier(ps2A, ops1A, ss1A, oss1A, shapes1A);
        assertFalse(r1.equals(r2));
        r2 = new DefaultDrawingSupplier(ps2B, ops1B, ss1B, oss1B, shapes1B);
        assertTrue(r1.equals(r2));
        // outline paint sequence
        r1 = new DefaultDrawingSupplier(ps2A, ops2A, ss1A, oss1A, shapes1A);
        assertFalse(r1.equals(r2));
        r2 = new DefaultDrawingSupplier(ps2B, ops2B, ss1B, oss1B, shapes1B);
        assertTrue(r1.equals(r2));
        // stroke sequence
        r1 = new DefaultDrawingSupplier(ps2A, ops2A, ss2A, oss1A, shapes1A);
        assertFalse(r1.equals(r2));
        r2 = new DefaultDrawingSupplier(ps2B, ops2B, ss2B, oss1B, shapes1B);
        assertTrue(r1.equals(r2));
        // outline stroke sequence
        r1 = new DefaultDrawingSupplier(ps2A, ops2A, ss2A, oss2A, shapes1A);
        assertFalse(r1.equals(r2));
        r2 = new DefaultDrawingSupplier(ps2B, ops2B, ss2B, oss2B, shapes1B);
        assertTrue(r1.equals(r2));
        // shape sequence
        r1 = new DefaultDrawingSupplier(ps2A, ops2A, ss2A, oss2A, shapes2A);
        assertFalse(r1.equals(r2));
        r2 = new DefaultDrawingSupplier(ps2B, ops2B, ss2B, oss2B, shapes2B);
        assertTrue(r1.equals(r2));

        // paint index
        r1.getNextPaint();
        assertFalse(r1.equals(r2));
        r2.getNextPaint();
        assertTrue(r1.equals(r2));

        // outline paint index
        r1.getNextOutlinePaint();
        assertFalse(r1.equals(r2));
        r2.getNextOutlinePaint();
        assertTrue(r1.equals(r2));

        // stroke index
        r1.getNextStroke();
        assertFalse(r1.equals(r2));
        r2.getNextStroke();
        assertTrue(r1.equals(r2));

        // outline stroke index
        r1.getNextOutlineStroke();
        assertFalse(r1.equals(r2));
        r2.getNextOutlineStroke();
        assertTrue(r1.equals(r2));

        // shape index
        r1.getNextShape();
        assertFalse(r1.equals(r2));
        r2.getNextShape();
        assertTrue(r1.equals(r2));
    }

    